package ch07;

import lombok.Getter;
import lombok.Setter;

import java.sql.DataTruncation;

@Getter
@Setter
public class News {
  private int aid;
  private String title;
  private String img;
  private String date;
  private String content;
}
