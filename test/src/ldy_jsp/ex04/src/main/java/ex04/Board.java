package ex04;



import java.sql.Date;

import lombok.Data;


@Data
public class Board {
int bno;
String title;
String content;
String writer;
Date regdate;
}
