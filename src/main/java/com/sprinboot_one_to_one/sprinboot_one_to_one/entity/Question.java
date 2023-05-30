package com.sprinboot_one_to_one.sprinboot_one_to_one.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @Column(name = "Q_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long qId;
    @Column(name = "QUESTION")
    String question;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "a_id")
    private Answer answer;

}
