package study.EndGame.file;

import lombok.Getter;
import lombok.Setter;
import study.EndGame.community.Community;
import study.EndGame.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "community_file_table")
public class FileEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String originalFileName;

    @Column
    private String storedFileName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "community_id")
    private Community community;

    public static FileEntity toFileEntity(Community community, String originalFileName, String storedFileName) {
        FileEntity fileEntity = new FileEntity();
        fileEntity.setOriginalFileName(originalFileName);
        fileEntity.setStoredFileName(storedFileName);
        fileEntity.setCommunity(community);
        return fileEntity;
    }
}