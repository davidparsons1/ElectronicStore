angular.module('ShopApp',[
    'ui.router',
    'ShopApp.navbar',
    'ShopApp.RegisterController',
    'ShopApp.addProductController',
    'ShopApp.loginController',
    'ShopApp.viewProductsController'

]).config(function($stateProvider) {

    $stateProvider
        .state('register', {
            url: "/account/register",
            templateUrl: "resources/js/views/register.html",
            controller: 'RegisterController'
        });

    $stateProvider
        .state('addProduct', {
            url: "/account/addProduct",
            templateUrl: "resources/js/views/addProduct.html",
            controller: 'addProductController'
        });

    $stateProvider
        .state('login', {
            url: "/account/login",
            templateUrl: "resources/js/views/login.html",
            controller: 'loginController'
        });

    $stateProvider
        .state('showProducts', {
            url: "/account/showProducts",
            templateUrl: "resources/js/views/showProducts.html",
            controller: 'viewProductsController'
        });

});




