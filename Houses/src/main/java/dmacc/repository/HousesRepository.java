/**
 * Housing Repository
 * @author Nikki McCloud
 * @version 1.0
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Housing;

@Repository
public interface HousesRepository extends JpaRepository<Housing, Long> {

}
