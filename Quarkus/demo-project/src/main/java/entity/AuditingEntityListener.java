package entity;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "auditing_entity_listener")
public class AuditingEntityListener {

    @PrePersist
    void preCreate(AbstractEntity auditable){

        Instant now = Instant.now();
        auditable.setCreatedDate(now);
        auditable.setLastModifiedDate(now);

    }

    @PreUpdate
    void preUpdate(AbstractEntity auditable){

        Instant now = Instant.now();
        auditable.setLastModifiedDate(now);



    }
}