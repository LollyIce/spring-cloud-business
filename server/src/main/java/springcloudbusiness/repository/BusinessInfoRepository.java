package springcloudbusiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springcloudbusiness.entity.BusinessInfo;

public interface BusinessInfoRepository extends JpaRepository<BusinessInfo,String> {


}
