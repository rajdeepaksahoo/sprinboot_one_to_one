package com.sprinboot_one_to_one.sprinboot_one_to_one.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Answer {
    @Id
    @Column(name = "A_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long aId;
    @Column(name = "ANSWER")
    String answer;
}
