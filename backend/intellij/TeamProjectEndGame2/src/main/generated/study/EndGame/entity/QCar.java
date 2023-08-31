package study.EndGame.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCar is a Querydsl query type for Car
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCar extends EntityPathBase<Car> {

    private static final long serialVersionUID = -338304849L;

    public static final QCar car = new QCar("car");

    public final StringPath carColor = createString("carColor");

    public final StringPath carName = createString("carName");

    public final NumberPath<Integer> carPrice = createNumber("carPrice", Integer.class);

    public final StringPath carType = createString("carType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QCar(String variable) {
        super(Car.class, forVariable(variable));
    }

    public QCar(Path<? extends Car> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCar(PathMetadata metadata) {
        super(Car.class, metadata);
    }

}

