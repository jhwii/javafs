package study.EndGame.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAskComment is a Querydsl query type for AskComment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAskComment extends EntityPathBase<AskCommentEntity> {

    private static final long serialVersionUID = 1571751019L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAskComment askComment = new QAskComment("askComment");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QAsk ask;

    public final StringPath commentContent = createString("commentContent");

    public final StringPath commentWriter = createString("commentWriter");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdTime = _super.createdTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedTime = _super.updatedTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QAskComment(String variable) {
        this(AskCommentEntity.class, forVariable(variable), INITS);
    }

    public QAskComment(Path<? extends AskCommentEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAskComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAskComment(PathMetadata metadata, PathInits inits) {
        this(AskCommentEntity.class, metadata, inits);
    }

    public QAskComment(Class<? extends AskCommentEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ask = inits.isInitialized("ask") ? new QAsk(forProperty("ask")) : null;
    }

}

