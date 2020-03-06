//package com.example.stocks.validator;
//
//import com.example.stocks.models.UserRegistration;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;
//
//@Component
//public class UserValidator implements Validator {
//    @Autowired
//    private UserService userService;
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return UserService.class.equals(aClass);
//    }
//
//    @Override
//    public void validate(Object o, Errors errors) {
//        UserRegistration user = (UserRegistration) o;
//
////        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
////        if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
////            errors.rejectValue("username", "Size.userForm.username");
////        }
//        if (userService.findByUsername(user.getEmail()) != null) {
//            errors.rejectValue("email", "Duplicate.userForm.email");
//        }
//
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
//        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
//            errors.rejectValue("password", "Size.userForm.password");
//        }
//
////        if (!user.getPasswordConfirm().equals(user.getPassword())) {
////            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
////        }
//    }
//}