package springcloudbusiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springcloudbusiness.entity.BusinessSupports;

import java.util.List;

public interface BusinessSupportsRepository extends JpaRepository<BusinessSupports,String> {

        List<BusinessSupports> findByBusinessId(String businessId);
}
