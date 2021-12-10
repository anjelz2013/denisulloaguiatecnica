# Autor: DenisUlloa
@stories
Feature: Academy Choucair
  As a user, I want to learn how to aumate in screamplay at the Choucair Academy with the autmation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
      | strUser | strPassword   |
      | 585558  | Choucair2021* |
    When he search for the course on the choucair academy platform
      | strCourse        |
      | Foundation Level |
    Then he finds the course called resources
      | strCourse        |
      | Foundation Level |