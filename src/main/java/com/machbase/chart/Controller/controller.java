package com.machbase.chart.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import com.machbase.chart.Service.TimeGraghService;
import com.machbase.chart.Dto.TimeGraghDto;

// @CrossOrigin (origins ="http://localhost:8080")
@Controller
public class controller {
    public controller(TimeGraghService TimegraghService) {
        this.TimegraghService = TimegraghService;
    }

    /***********************    홈 화면   ***************************/
    @GetMapping("/home")
    public String home() {
        return "home";
    }


    /***********************    센서 1번   ***************************/
    private TimeGraghService TimegraghService;

    @GetMapping("/sensor_01") 
    public String sensor_01(Model model) throws Exception {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        System.out.println(TimegraghDtoList.getClass().getTypeName());
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_01";
    }

    
    /***********************    센서 2번   ***************************/
    @GetMapping("/sensor_02") 
    public String sensor_02(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_02";
    }


     /***********************    센서 3번   ***************************/
    @GetMapping("/sensor_03") 
    public String sensor_03(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_03";
    }
    

     /***********************    센서 4번   ***************************/
    @GetMapping("/sensor_04") 
    public String sensor_04(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_04";
    }


     /***********************    센서 5번   ***************************/
    @GetMapping("/sensor_05") 
    public String sensor_05(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_05";
    }


     /***********************    센서 6번   ***************************/
    @GetMapping("/sensor_06") 
    public String sensor_06(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_06";
    }


     /***********************    센서 7번   ***************************/
    @GetMapping("/sensor_07") 
    public String sensor_07(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_07";
    }


     /***********************    센서 8번   ***************************/
    @GetMapping("/sensor_08") 
    public String sensor_08(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_08";
    }


     /***********************    센서 9번   ***************************/
    @GetMapping("/sensor_09") 
    public String sensor_09(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_09";
    }
    

     /***********************    센서 10번   ***************************/
    @GetMapping("/sensor_10") 
    public String sensor_10(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_10";
    }


     /***********************    센서 11번   ***************************/
    @GetMapping("/sensor_11") 
    public String sensor_11(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_11";
    }


     /***********************    센서 12번   ***************************/
    @GetMapping("/sensor_12") 
    public String sensor_12(Model model) {
        List<TimeGraghDto> TimegraghDtoList = TimegraghService.getGraghList();
        model.addAttribute("TimegraghList", TimegraghDtoList);
        return "sensor_12";
    }


}
