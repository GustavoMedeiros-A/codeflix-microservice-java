package catalog.application;

import catalog.domain.category.Category;

public class UseCase {

    public Category execute() {
        return Category.newCategory("Filme", "description", true);
    }

}