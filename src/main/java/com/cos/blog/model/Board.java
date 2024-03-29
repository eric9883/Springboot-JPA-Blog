package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private int id;

    @ManyToOne(fetch = FetchType.EAGER) //Many = Board, User = One
    @JoinColumn(name = "userId")
    private User user;


    @Column(nullable = false, length = 100)
    private String title;

    @Lob
    private String content; // summer note library
                            // <html> is mixed with design

    @ColumnDefault("0")
    private int count; // view count




    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER)
    private List<Reply> reply;

    @CreationTimestamp
    private Timestamp createDate;



}
