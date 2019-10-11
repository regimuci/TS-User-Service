package TS.User.repositories;

import TS.User.entities.Group;
import TS.User.entities.Role;
import TS.User.entities.User;
import TS.User.entities.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserGroupRepository extends JpaRepository<UserGroup,Long> {
    List<UserGroup> findByUser(User user);
    List<UserGroup> findByGroup(Group group);
    void deleteByGroupAndUser(Group group,User user);
    UserGroup findByGroupAndUser(Group group,User user);
    UserGroup findByGroupAndRole(Group group, Role role);
}
