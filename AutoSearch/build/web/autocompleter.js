
$(document).ready(function () {
    $(function () {
        $("#search").autocomplete({
           source: function (request, response) {
                $.ajax({
                    url: "Controller",
                    type: "GET",
                    data: {
                        term: request.term
                    },
                    dataType: "json",
                    success: function (data) {
                    // response($.parseJSON(data).searchList);
                        response(data);
                    }
                });
            } 
    
        });
    });
});

