package com.tmdbproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tmdbprojectapplication")
@SolrDocument(solrCoreName = "product")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Field
    @Indexed(name = "id", type = "string")
    private Integer id;

    @Field
    @Column(name = "title")
    @JsonProperty("title")
    @Indexed(name = "title", type = "string")
    private String title;

    @Field
    @Column(name = "release_date")
    @JsonProperty("release_date")
    private String release_date;

//    @Field
//    @Column(name = "overview")
//    @JsonProperty("overview")
//    private String overview;

    @Field
    @Column(name = "original_language ")
    @JsonProperty("original_language ")
    private String original_language ;

    @Field
    @Column(name = "vote_avarage")
    @JsonProperty("vote_avarage")
    private String vote_avarage;

    public Movie(
                 String title,
                 String release_date,
//                 String overview,
                 String original_language,
                 String vote_avarage
                    )
                    {
        this.title = title;
        this.release_date = release_date;
//        this.overview = overview;
        this.original_language  = original_language ;
        this.vote_avarage = vote_avarage;
    }

         public Movie() {
        }

        public Integer getId () {
            return id;
        }


        public String getTitle () {
            return title;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public String getRelease_date () {
            return release_date;
        }

        public void setRelease_date (String release_date){
            this.release_date = release_date;
        }

//        public String getOverview () {
//            return overview;
//        }
//
//        public void setOverview (String overview){
//            this.overview = overview;
//        }

        public String getOriginal_language  () {
            return original_language ;
        }

        public void setOriginal_language  (String original_language ){
            this.original_language  = original_language ;
        }

        public String getVote_avarage () {
            return vote_avarage;
        }

        public void setVote_avarage (String vote_avarage){
            this.vote_avarage = vote_avarage;
        }

        @Override
        public String toString () {
            return "Movie{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", release_date=" + release_date + '\'' +
 //                   ", overview='" + overview + '\'' +
                    ", original_language ='" + original_language + '\'' +
                    ", vote_avarage='" + vote_avarage + '\'' +
                    '}';
        }
}
