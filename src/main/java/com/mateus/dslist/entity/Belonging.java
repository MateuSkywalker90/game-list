package com.mateus.dslist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "belonging")
@Entity
public class Belonging implements Serializable {

    @EmbeddedId
    private BelongingId id = new BelongingId();

    @ManyToOne
    @MapsId("gameId")
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @MapsId("gameListId")
    @JoinColumn(name = "game_list_id")
    private GameList gameList;

    private Integer position;
}
