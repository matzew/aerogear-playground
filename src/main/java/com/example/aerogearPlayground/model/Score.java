package com.example.aerogearPlayground.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import java.lang.Override;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Score implements Serializable
{

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", updatable = false, nullable = false)
   private Long id = null;
   @Version
   @Column(name = "version")
   private int version = 0;

   @Column
   private String team1;

   @Column
   private String team2;

   @Column
   private String result;

   public Long getId()
   {
      return this.id;
   }

   public void setId(final Long id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return this.version;
   }

   public void setVersion(final int version)
   {
      this.version = version;
   }

   @Override
   public boolean equals(Object that)
   {
      if (this == that)
      {
         return true;
      }
      if (that == null)
      {
         return false;
      }
      if (getClass() != that.getClass())
      {
         return false;
      }
      if (id != null)
      {
         return id.equals(((Score) that).id);
      }
      return super.equals(that);
   }

   @Override
   public int hashCode()
   {
      if (id != null)
      {
         return id.hashCode();
      }
      return super.hashCode();
   }

   public String getTeam1()
   {
      return this.team1;
   }

   public void setTeam1(final String team1)
   {
      this.team1 = team1;
   }

   public String getTeam2()
   {
      return this.team2;
   }

   public void setTeam2(final String team2)
   {
      this.team2 = team2;
   }

   public String getResult()
   {
      return this.result;
   }

   public void setResult(final String result)
   {
      this.result = result;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (team1 != null && !team1.trim().isEmpty())
         result += "team1: " + team1;
      if (team2 != null && !team2.trim().isEmpty())
         result += ", team2: " + team2;
      if (result != null && !result.trim().isEmpty())
         result += ", result: " + result;
      return result;
   }
}