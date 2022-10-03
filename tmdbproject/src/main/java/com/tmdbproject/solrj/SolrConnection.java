//package com.tmdbproject.solrj;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.solr.core.mapping.Indexed;
//import org.springframework.data.solr.core.mapping.SolrDocument;
//
//public class SolrConnection {
//    @SolrDocument(solrCoreName = "movie")
//    public class Movie {
//
//        @Id
//        @Indexed(name = "id", type = "string")
//        private String id;
//
//        @Indexed(name = "title", type = "string")
//        private String title;
//
//    }
//}
