package controller;

import service.GetArrayService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class GetArrayController {
    public GetArrayController() {
    }

    @RequestMapping({"/array"})
    @ResponseBody
    public ResultModel GetArray() {
        long startTime = System.nanoTime();
        ResultModel result = new ResultModel();
        result.setStartTime(startTime);
        GetArrayService arrayService = new GetArrayService();
        result.resultArray = arrayService.GetRandomArray();
        long endTime = System.nanoTime();
        result.setEndTime(endTime);
        result.timeCost = "执行耗时" + (double)(result.getEndTime() - result.getStartTime()) / 1000000.0D + "毫秒";
        return result;
    }
}

class ResultModel {
    public int[] resultArray;
    public long startTime;
    public long getStartTime(){return startTime;}
    public void setStartTime(long startTime){ this.startTime = startTime;}
    public long endTime;
    public long getEndTime(){return endTime;}
    public void setEndTime(long endTime){ this.endTime = endTime;}
    public String timeCost;
}