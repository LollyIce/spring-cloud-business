package springcloudbusiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloudbusiness.DTO.Business;
import springcloudbusiness.VO.ResultVO;
import springcloudbusiness.service.BusinessService;
import springcloudbusiness.utils.ResultVOUtil;

@RestController
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @GetMapping("/seller")
    @CrossOrigin
    public ResultVO seller(){
        ResultVO resultVO = new ResultVO();
        Business business = businessService.getBusiness();
        return ResultVOUtil.success(business);
    }
}
