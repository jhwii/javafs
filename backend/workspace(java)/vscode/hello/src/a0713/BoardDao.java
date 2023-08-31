package a0713;
// p.688 7번
import java.util.ArrayList;
import java.util.List;

import a0712.p_642.Board;

public class BoardDao {
    public List<Board> getBoardList(){
        List<Board> list = new ArrayList<Board>();
        list.add(new Board("제목1","내용1"));
        list.add(new Board("제목2","내용2"));
        list.add(new Board("제목3","내용3"));
        return list;
    }
}
