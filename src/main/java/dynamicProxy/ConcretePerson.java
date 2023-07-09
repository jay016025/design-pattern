package dynamicProxy;

public class ConcretePerson implements Person{

    String name;
    String gender;
    String interests;
    Integer rating = 0;
    int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public Integer getRating() {
        if(rating == 0) return 0;
        return (rating / ratingCount);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interest) {
        this.interests = interest;
    }

    @Override
    public void setRating(Integer rating) {
        this.rating += rating;
        ratingCount++;
    }
}
