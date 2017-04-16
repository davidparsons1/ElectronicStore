
angular.module('ShopApp.navbar',[]).
directive('navbar', function ($http, $state) {
    return{
        restrict:'E',
        scope : {

        },

        controller:function ($scope) {
            $scope.goToAddProducts = function(){
                $state.go('addProduct');
            };

            $scope.goToRegister = function () {
                $state.go('register');
            };

            $scope.goToLogin = function(){
                $state.go('login');
            };

            $scope.goToShowProducts = function(){
                $state.go('showProducts');
            };
        },
        templateUrl:'resources/js/directives/navbar.html',
        transclude: false
    }
});
