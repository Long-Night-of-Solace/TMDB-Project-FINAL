package com.tmdbproject.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMovie is a Querydsl query type for Movie
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovie extends EntityPathBase<Movie> {

    private static final long serialVersionUID = 110457138L;

    public static final QMovie movie = new QMovie("movie");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath original_language = createString("original_language");

    public final StringPath overview = createString("overview");

    public final StringPath release_date = createString("release_date");

    public final StringPath title = createString("title");

    public final StringPath vote_avarage = createString("vote_avarage");

    public QMovie(String variable) {
        super(Movie.class, forVariable(variable));
    }

    public QMovie(Path<? extends Movie> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovie(PathMetadata metadata) {
        super(Movie.class, metadata);
    }

}

