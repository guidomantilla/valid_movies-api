package valid.movies.api.ws;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;
import valid.movies.api.model.Films;

@Repository
@PreAuthorize("hasAnyAuthority('role_admin','role_user')")
@RepositoryRestResource(path = "films")
public interface FilmsRepositoryWs extends JpaRepository<Films, Integer> {
}
