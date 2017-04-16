angular.module('ShopApp.addToCart',[]).
controller('addToCart', function ($scope, $http, $state) {

    $scope.addToCart = function () {
        $http.post('/restful-services/api/addToCart', JSON.stringify($scope.product)).
        success(function (data, status) {
            if(status==200){
                $scope.cart = data;
                console.log("added to cart");
                console.log($scope.user, 'This is the user object');



            }
        }).
        error(function (error) {
            console.log(error);
        });
    };
}