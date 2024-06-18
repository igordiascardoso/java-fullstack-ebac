package br.com.idias.Domain.Jpa;

import javax.persistence.MappedSuperclass;

/**
 * @author idias
 */
@MappedSuperclass
public interface Persistente {
    public Long getId();

    public void setId(Long id);
}