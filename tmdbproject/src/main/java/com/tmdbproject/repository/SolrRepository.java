//package com.tmdbproject.repository;
//
//import com.tmdbproject.model.Movie;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.solr.repository.Query;
//import org.springframework.data.solr.repository.SolrCrudRepository;
//
//import java.util.List;
//
//public interface SolrRepository extends SolrCrudRepository<Movie, String> {
////            public List<Movie> findByName(String name);
//
//            @Query("id:*?0* OR name:*?0*")
//            public Page<Movie> findByCustomQuery(String searchTerm, Pageable pageable);
//
////            @Query(name = "Movie.findByTitleQuery")
////            public Page<Movie> findByTitleQuery(String searchTerm, Pageable pageable);
//}
