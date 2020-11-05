package com.WCF.WCF.Repository;

import com.WCF.WCF.Model.WCFEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WCFRepository extends CrudRepository<WCFEntity, Long> {

}
