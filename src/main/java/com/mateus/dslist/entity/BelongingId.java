package com.mateus.dslist.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BelongingId implements Serializable {

    private Long gameId;
    private Long gameListId;

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        BelongingId that = (BelongingId) object;
        return Objects.equals(gameId, that.gameId) && Objects.equals(gameListId, that.gameListId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, gameListId);
    }
}
