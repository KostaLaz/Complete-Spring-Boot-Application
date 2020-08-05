
$('document').ready(function(){
    $('table #update-button').on('click', function(event){
        event.preventDefault();
        let href = $(this).attr('href');
        $.get(href, function(country, status){
            $('#idEdit').val(country.id);
            $('#descriptionEdit').val(country.description);
            $('#capitalEdit').val(country.capital);
            $('#codeEdit').val(country.code);
            $('#nationalityEditEdit').val(country.nationality);
            $('#continentEdit').val(country.continent);
        });
        $('#editModal').modal();
    });
});

