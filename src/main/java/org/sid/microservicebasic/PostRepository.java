
package org.sid.microservicebasic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;


@CrossOrigin("*")
@RepositoryRestResource
public interface PostRepository extends JpaRepository<Post,Long> {
    @Override
    List<Post> findAll();
}



