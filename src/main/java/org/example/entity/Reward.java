package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.ItemTypes.ItemType;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @Column(nullable = false)
    private int amount;

    @ManyToOne
    @JoinColumn(name = "quest_id")
    private Quest quest;
}
