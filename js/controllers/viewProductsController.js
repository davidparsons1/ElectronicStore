/**
 * Created by marym on 14/04/2017.
 */
angular.module('ShopApp.viewProductsController',[]).
controller('viewProductsController', function ($scope, $http, $state) {

    $http.get('restful-services/api/getAllProducts')
        .success(function (data, status) {
            $scope.products = data;
        })
        .error(function (error) {
            alert('An error occurred');
        });

});

