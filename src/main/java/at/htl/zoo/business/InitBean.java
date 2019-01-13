package at.htl.zoo.business;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Startup
@Singleton
public class InitBean {
    @PersistenceContext
    EntityManager em;

    public InitBean(){

    }

    @PostConstruct
    private void init() {
       /*
       create table DIREKTOR
        (
          ID       BIGINT not null
            constraint DIREKTOR_PK
              primary key,
          VORNAME  VARCHAR(255),
          NACHNAME VARCHAR(255),
          GEHALT   INTEGER
        );

        create table TIER
        (
          ID      BIGINT not null
            constraint TIER_PK
              primary key,
          NAME    VARCHAR(255),
          RASSE   VARCHAR(255),
          GROESSE INTEGER,
          GEWICHT INTEGER,
          "alter" INTEGER
        );

        create table ZOO
        (
          ID          BIGINT not null
            constraint ZOO_PK
              primary key,
          NAME        VARCHAR(255),
          ORT         VARCHAR(255),
          DIREKTOR_ID BIGINT
            constraint ZOO_DIREKTOR_ID_FK
              references DIREKTOR
        );

        create table GEHEGE
        (
          ID     BIGINT not null
            constraint GEHEGE_PK
              primary key,
          ZOO_ID BIGINT
            constraint GEHEGE_ZOO_ID_FK
              references ZOO
        );

        create table AUFENTHALT
        (
          ID        BIGINT not null
            constraint AUFENTHALT_PK
              primary key,
          GEHEGE_ID BIGINT
            constraint AUFENTHALT_GEHEGE_ID_FK
              references GEHEGE,
          TIER_ID   BIGINT
            constraint AUFENTHALT_TIER_ID_FK
              references TIER
        );

        create table TIERPFLEGER
        (
          ID       BIGINT not null
            constraint TIERPFLEGER_PK
              primary key,
          VORNAME  VARCHAR(255),
          NACHNAME VARCHAR(255),
          GEHALT   INTEGER,
          ZOO_ID   BIGINT
            constraint TIERPFLEGER_ZOO_ID_FK
              references ZOO
        );

        create table BETREUUNG
        (
          ID             BIGINT not null
            constraint BETREUUNG_PK
              primary key,
          TIERPFLEGER_ID BIGINT
            constraint BETREUUNG_TIERPFLEGER_ID_FK
              references TIERPFLEGER,
          GEHEGE_ID      BIGINT
            constraint BETREUUNG_GEHEGE_ID_FK
              references GEHEGE
        );
        */

        //Imports

    }

}
