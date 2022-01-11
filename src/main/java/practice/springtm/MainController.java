package practice.springtm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import practice.springtm.model.MainModel;

@Controller
public class MainController {
    
    @RequestMapping
    public String get(Model model){

        // SqlConnection sql = new SqlConnection();
        // try {
        //     sql.sqlConnection();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        return "edit";
    }

    @PostMapping("/save")
	public String output1(@RequestParam String text1, String text2, String text3,  String text4,  String text5, Model model) {

        // Model instance
        MainModel mainModel = new MainModel();

        // Change null to empty string
        List<String> list = new ArrayList<String>();
        list = mainModel.nullToEmptyString(text1, text2, text3, text4, text5);

        list = mainModel.saveData(list);
        for (int i = 0; i < 5; i++){
            model.addAttribute("moji" + (i + 1), list.get(i));
        }
        return "confirm";
	}

    @PostMapping("/returnToEdit")
	public String returnToEdit(@RequestParam String moji1, String moji2, String moji3, String moji4, String moji5, Model model) { 

        // Model instance
        MainModel mainModel = new MainModel();

        // Change null to empty string
        List<String> list = new ArrayList<String>();
        list = mainModel.nullToEmptyString(moji1, moji2, moji3, moji4, moji5);

        list = mainModel.saveData(list);
        for (int i = 0; i < 5; i++){
            model.addAttribute("text" + (i + 1), list.get(i));
        }
        //return new RedirectView("http://localhost:8080/");
        return "edit";
    }
}
