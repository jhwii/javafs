package study.EndGame.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCommunity is a Querydsl query type for Community
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommunity extends EntityPathBase<Community> {

    private static final long serialVersionUID = -70893436L;

    public static final QCommunity community = new QCommunity("community");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final ListPath<CommentEntity, QCommentEntity> commentEntityList = this.<CommentEntity, QCommentEntity>createList("commentEntityList", CommentEntity.class, QCommentEntity.class, PathInits.DIRECT2);

    public final StringPath communityContents = createString("communityContents");

    public final NumberPath<Integer> communityHits = createNumber("communityHits", Integer.class);

    public final StringPath communityPass = createString("communityPass");

    public final StringPath communityTitle = createString("communityTitle");

    public final StringPath communityWriter = createString("communityWriter");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdTime = _super.createdTime;

    public final NumberPath<Integer> fileAttached = createNumber("fileAttached", Integer.class);

    public final ListPath<FileEntity, QFileEntity> fileEntityList = this.<FileEntity, QFileEntity>createList("fileEntityList", FileEntity.class, QFileEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedTime = _super.updatedTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QCommunity(String variable) {
        super(Community.class, forVariable(variable));
    }

    public QCommunity(Path<? extends Community> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommunity(PathMetadata metadata) {
        super(Community.class, metadata);
    }

}

