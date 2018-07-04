'use strict';

angular.module('myApp').controller('UserController', ['$scope', 'UserService', function ($scope, UserService) {
    var self = this;
    self.user = {id: null, username: '', address: '', email: ''};
    self.users = [];

    self.submit = submit;
    self.edit = edit;
    self.remove = remove;
    self.reset = reset;


    fetchAllEmployee();

    function fetchAllEmployee() {
        UserService.fetchAllEmployee()
            .then(
                function (d) {
                    self.users = d;
                },
                function (errResponse) {
                    console.error('Error while fetching Users');
                }
            );
    }
}]);