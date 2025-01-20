package com.mateus.dslist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "games")
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title", nullable = false, length = 100)
    private String title;
    @Column(name = "game_year")
    private Integer year;
    @Column(name = "genre", nullable = false, length = 100)
    private String genre;
    @Column(name = "platform", nullable = false, length = 150)
    private String platform;
    @Column(name = "img_url", length = 200)
    private String imgUrl;
    @Column(name = "short_description", nullable = false, length = 100)
    private String shortDescription;
    @Column(name = "long_description", length = 200)
    private String longDescription;

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Game game = (Game) object;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
