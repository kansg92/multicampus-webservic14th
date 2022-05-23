const API_KEY = "4c86bc69de6fcfac2175ad188df5eacf"
const weather = document.querySelector("#weather span:first-child");
const city = document.querySelector("#weather span:last-child");

function onGeoOk(position){
    const lat = position.coords.latitude;
    const lon = position.coords.longitude;
    const url =`https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}&units=metric`
    fetch(url).then((reponse) => reponse.json()).then((data) => { 
        console.log(data);
        city.innerText = data.name; 
        weather.innerText = `${data.weather[0].main} / ${data.main.temp}°C`;
    });
}
function onGeoError(){
    alert("Can't find you. No weather for you.")
}


navigator.geolocation.getCurrentPosition(onGeoOk, onGeoError);