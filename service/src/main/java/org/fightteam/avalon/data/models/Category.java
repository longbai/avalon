package org.fightteam.avalon.data.models;

import lombok.Getter;
import lombok.Setter;
import org.fightteam.join.dao.entity.AbstractEntity;

import javax.persistence.Entity;

/**
 * 分类
 *
 * @author faith
 * @since 0.0.1
 */
@Entity
@Getter
@Setter
public class Category extends AbstractEntity<Long> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
