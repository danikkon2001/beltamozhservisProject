package by.btslogistics.beltamozhservisproject.repository;

import by.btslogistics.beltamozhservisproject.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Alexsei
 * @author Yaroslav
 *
 */
@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
