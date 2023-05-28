let allContainerCart = document.querySelector('.products');
let containerBuyCart = document.querySelector('.card-items');
let priceTotal = document.querySelector('.price-total');
let amountProduct = document.querySelector('.count-product');
let buyThings = [];
let totalCard = 0;
let countProduct = 0;
loadEventListenrs();
function loadEventListenrs() {
    allContainerCart.addEventListener('click', addProduct);
    containerBuyCart.addEventListener('click', deleteProduct);
}


function addProduct(e) {
    e.preventDefault();
    if (e.target.classList.contains('btn-add-cart')) {
        const selectProduct = e.target.parentElement;
        readTheContent(selectProduct);
    }
}

function deleteProduct(e) {
    if (e.target.classList.contains('delete-product')) {
        const deleteId = e.target.getAttribute('data-id');
        buyThings.forEach(value => {
            if (value.id == deleteId) {
                let priceReduce = parseFloat(value.price) * parseFloat(value.amount);
                totalCard = totalCard - priceReduce;
                totalCard = totalCard.toFixed(2);
            }
        });
        buyThings = buyThings.filter(product => product.id !== deleteId);
        countProduct--;
    }

    if (buyThings.length === 0) {
        priceTotal.innerHTML = 0;
        amountProduct.innerHTML = 0;
    }
    loadHtml();
}

function readTheContent(product) {
    const infoProduct = {
        image: product.querySelector('div img').src,
        title: product.querySelector('.title').textContent,
        price: product.querySelector('div p span').textContent,
        id: product.querySelector('a').getAttribute('data-id'),
        amount: 1
    }

    totalCard = parseFloat(totalCard) + parseFloat(infoProduct.price);
    totalCard = totalCard.toFixed(2);
    const exist = buyThings.some(product => product.id === infoProduct.id);
    if (exist) {
        const pro = buyThings.map(product => {
            if (product.id === infoProduct.id) {
                product.amount++;
                return product;
            } else {
                return product
            }
        });
        buyThings = [...pro];
    } else {
        buyThings = [...buyThings, infoProduct]
        countProduct++;
    }
    loadHtml();
}

function loadHtml() {
    clearHtml();
    buyThings.forEach(product => {
        const {image, title, price, amount, id} = product;
        const row = document.createElement('div');
        row.classList.add('item');
        row.innerHTML = `
            <img src="${image}" alt="">
            <div class="item-content">
                <h5>${title}</h5>
                <h5 class="cart-price">${price}$</h5>
                <h6>Cantidad: ${amount}</h6>
            </div>
            <span class="delete-product" data-id="${id}">X</span>
        `;
        containerBuyCart.appendChild(row);
        priceTotal.innerHTML = totalCard;
        amountProduct.innerHTML = countProduct;
    });
}
function clearHtml() {
    containerBuyCart.innerHTML = '';
}
function showCart(x) {
    document.getElementById("products-id").style.display = "block";
}
function closeBtn() {
    document.getElementById("products-id").style.display = "none";
}



var IconWhatsapp = document.querySelector('#icon-whatsapp');
var formulariowtsp = document.getElementById('formulariowtsp');
var closemodal = document.querySelector('.closemodal');
var sendbttn = document.querySelector('#sendbttn');
IconWhatsapp.addEventListener('click', function () {
    formulariowtsp.classList.toggle('entrarysalir')
})

closemodal.addEventListener('click', function () {
    formulariowtsp.classList.remove('entrarysalir')
})

sendbttn.addEventListener('click', EnviarMensaje)

function EnviarMensaje() {


    let name = document.querySelector('#inputname').value;
    let mensaje = document.querySelector('#inputmensaje').value;
    let url = "https://api.whatsapp.com/send?phone=573023268469&text=Nombre: %0A" + name +
            "%0A%0AMensaje: %0A" + mensaje + "%0A";
    window.open(url);
}


function sendCartByWhatsApp() {
    const containerBuyCart = document.querySelector('.card-items');
    const priceTotal = document.querySelector('.price-total');
    const nombre = document.getElementById('nombre').value;
    const idcliente = document.getElementById('idcliente').value;
    const direccion = document.getElementById('direccion').value;
    const telefono = document.getElementById('telefono').value;
    const metodoPago = document.getElementById('metodo-pago').value;

    let message = `Hola! Mi nombre es ${nombre}, mi carrito de compras:\n`;
    containerBuyCart.childNodes.forEach((item) => {
        const title = item.querySelector('.item-content h5').textContent;
        const price = item.querySelector('.cart-price').textContent;
        const amount = item.querySelector('.item-content h6').textContent;
        message += `${title} - ${price} - ${amount}\n`;
    });
    message += `Total: ${priceTotal.textContent}\n`;
    message += `Mi identificacion es: ${idcliente}\n`;
    message += `Mi direccion es: ${direccion}\n`;
    message += `Mi telefono es: ${telefono}\n`;
    message += `Mi metodo de pago es: ${metodoPago}`;

    const phoneNumber = '3023268469';
    const messageText = encodeURI(message);
    const url = `https://wa.me/${phoneNumber}?text=${messageText}`;
    window.open(url);
}


function showForm() {
    var form = document.getElementById("myForm");
    form.style.display = "block";
}

var form = document.getElementById("myForm");
form.addEventListener("submit", function (event) {
    event.preventDefault();
    sendCartByWhatsApp();
});

function closeForm() {
    var form = document.getElementById("myForm");
    form.style.display = "none";
}

function showForm() {
    var form = document.getElementById("myForm");
    form.style.display = "block";
}

var form = document.getElementById("myForm");
form.addEventListener("submit", function (event) {
    event.preventDefault();
});
function showForm() {
    var btnFinalizarCompra = document.getElementById("finalizar-compra-btn");
    var form = document.getElementById("myForm");
    btnFinalizarCompra.style.display = "none";
    form.style.display = "block";
}



