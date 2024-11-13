/// <reference types="cypress" />

describe("Testar o cadastro de usuários no site.", () => {
    beforeEach(() => {
        cy.visit('https://agenda-contatos-react.vercel.app/')
    })

    it("Deve verificar se a página está aparecendo", () => {
        cy.get('input').should('have.length', 3)
    })

    it("Deve cadastrar um contato na agenda.", () => {
        cy.get('[type="text"]').type("igor dias")
        cy.get('[type="email"]').type("stesteigor@gmail.com")
        cy.get('[type="tel"]').type("61995341212")
        cy.get('.adicionar').click()
        cy.get('.contato').should('have.length', 4)
    })

    it("Deve editar um contato", () => {
        cy.get('.edit').first().click()
        cy.get('[type="text"]').clear().type("novo igor")
        cy.get('[type="email"]').clear().type("testeebac@gmail.com")
        cy.get('[type="tel"]').clear().type("61999999999")
        cy.get('.alterar').click()
        cy.get(':nth-child(2) > .sc-dmqHEX > .sc-eDDNvR > :nth-child(1)').should('have.text', 'Gian Souza')
    })

    it("Deve apagar o contato criado.", () => {
        cy.get(':nth-child(5) > .sc-gueYoa > .delete').click()
        cy.get('.contato').should('have.length', 3)
    })
})