$(document).ready(() => searchFood(''))

function searchFood(title) {
    $.ajax({
        url: 'api/searchFoods?name=' + title,
        method: "GET",
        success: data => {
            let foodHtml = "";

            for (let i = 0; i < data.length; i++) {
                foodHtml += "" +
                    "<td>\n" +
                    "    <div class=\"food-box\">\n" +
                    "        <h2>" + data[i]['title'] + "</h2>\n" +
                    "        <p>" + data[i]['description'] + "</p>\n" +
                    "        <p class=\"food-price\">Price: " + data[i]['price'] + "tk</p>\n" +
                    "        <div class='food-container-buttons'>\n" +
                    "            <a href=\"./payment/" + data[i]['foodID'] + "\"><button type=\"button\" class=\"button\">Buy</button></a>\n" +
                    "        </div>\n" +
                    "    </div>\n" +
                    "</td>";

                document.getElementById('foods-table').innerHTML = foodHtml;
            }
        }
    });

    $('label').removeClass('white-back-text');
    $('#' + category).addClass('white-back-text');
}

