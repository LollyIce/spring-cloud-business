package springcloudbusiness.service.Impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloudbusiness.DTO.Business;
import springcloudbusiness.DTO.Supports;
import springcloudbusiness.entity.BusinessInfo;
import springcloudbusiness.entity.BusinessSupports;
import springcloudbusiness.repository.BusinessInfoRepository;
import springcloudbusiness.repository.BusinessSupportsRepository;
import springcloudbusiness.service.BusinessService;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessInfoRepository infoRepository;
    @Autowired
    private BusinessSupportsRepository supportsRepository;
    @Override
    public Business getBusiness() {
        List<BusinessInfo> all = infoRepository.findAll();
        BusinessInfo businessInfo = all.get(0);

        String[] businessPics = businessInfo.getBusinessPics().split(",");
        String[] businessInfos = businessInfo.getBusinessInfos().split(",");
        Business business = new Business();
        BeanUtils.copyProperties(businessInfo,business);
        business.setBusinessPicsArray(businessPics);
        business.setBusinessInfosArray(businessInfos);
        List<BusinessSupports> supports = supportsRepository.findByBusinessId(businessInfo.getBusinessId());
        List<Supports> supports1 = new ArrayList<>();
        for (BusinessSupports supports2:supports) {
            Supports supports3 = new Supports();
            BeanUtils.copyProperties(supports2,supports3);
            supports1.add(supports3);
        }
        business.setSupports(supports1);
        return business;
    }
}
