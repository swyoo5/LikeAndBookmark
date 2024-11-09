//package org.lsh.teamthreeproject.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Embeddable;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;
//
//
//@Embeddable
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode
//@Data
//public class BookMarkId {
//    @Column(name="board_id")
//    private Long boardId;
//    @Column(name="user_id")
//    private Long userId;
//}

package org.lsh.teamthreeproject.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class BookMarkId {
    private long boardId;
    private long userId;
    public BookMarkId() {}

    public BookMarkId(long boardId, long userId) {
        this.boardId = boardId;
        this.userId = userId;
    }
}
