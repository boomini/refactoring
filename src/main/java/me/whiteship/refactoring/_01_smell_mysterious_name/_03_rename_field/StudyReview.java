package me.whiteship.refactoring._01_smell_mysterious_name._03_rename_field;

public record StudyReview(String reviewer, String review) {
	//record라는 키워드를 사용해서 정의를 한다.
	//hashcord, equals, tostring자동으로 생성된다.
}
