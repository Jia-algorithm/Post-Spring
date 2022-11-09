package com.sap.cc.library.entity;

public class BookFixtures {
    public static Post cleanCode() {
        return new Post("Clean Code", new Author("Robert C. Martin"));
    }

    public static Post refactoring() {
        return new Post("Refactoring", new Author("Martin Fowler"));
    }

    public static Post domainDrivenDesign() {
        return new Post("Domain-Driven-Design", new Author("Eric Evans"));
    }

    public static Post designPatterns() {
        return new Post("Design Patterns", new Author("Gang of Four"));
    }

    public static Post modernOperatingSystems() {
        return new Post("Modern Operating Systems", new Author("Andrew S. Tanenbaum"));
    }
}
